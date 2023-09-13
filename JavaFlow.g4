grammar JavaFlow;
program : model* EOF ; 
model : ID '(' (layer ',')* layer ')' ;

layer : 'gmax' tensor    #GlobalMax
      | 'max' tensor     #Max
      | 'gavg' tensor    #GlobalAvg
      | 'avg' tensor     #Avg
      | 'conv' tensor    #conv
      | 'deconv' tensor  #DeConv
      | 'flatten'        #Flatten
      | 'reshape' tensor #Reshape
      | 'resize' tensor  #Resizing
      | 'rescale'
      | 'dense' tensor   #Dense
      | 'iden'           #Identity
      | 'norm'           #Normalization
      | 'dropout' exp    #Dropout
      | ID               #Activation
      ;

exp : tensor      #Const
    | exp OP NUM  #Op
    | '(' exp ')' #Group
    ;

tensor : (NUM 'x')* NUM ;

ID : [a-zA-Z]+ ;
NUM : [0-9]+('.'[0-9]+)? ;
OP : '+'|'-'|'*'|'/' ;
ESPACOS : (' '|'\n') -> skip ; 