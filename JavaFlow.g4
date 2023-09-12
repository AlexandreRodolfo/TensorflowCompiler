grammar JavaFlow;
program : model* EOF ; 
model : ID '(' tensor ',' (layer ',')* tensor ')' ;

layer : 'gmax' tensor    #GlobalMax
      | 'max' tensor     #Max
      | 'gavg' tensor    #GlobalAvg
      | 'avg' tensor     #Avg
      | 'conv' tensor    #conv
      | 'deconv' tensor  #DeConv
      | 'flatten'        #Flatten
      | 'reshape' tensor #Reshape
      | 'resize' tensor  #Resizing
      | 'dense' tensor   #Dense
      | 'iden'           #Identity
      | 'norm'           #Normalization
      | 'elu'            #Elu
      | 'exp'            #Exponential
      | 'gelu'           #Gelu
      | 'sigmoid'        #Sigmoid
      | 'linear'         #Linear
      | 'softmax'        #Softmax
      | 'tanh'           #Tanh
      | 'relu'           #Relu
      ;

tensor : (exp 'x')* exp ;

exp : NUM         #Const
    | exp OP exp  #Op
    | '(' exp ')' #Group
    ;

ID : [a-zA-Z]+ ;
NUM : [0-9]+ ;
OP : '+'|'-'|'*'|'/' ;
ESPACOS : (' '|'\n') -> skip ; 