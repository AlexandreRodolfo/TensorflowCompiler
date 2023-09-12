grammar JavaFlow;

program : model* EOF ; 

model : ID '(' tensor ',' (layer ',')* tensor ')'
      ;

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
      | 'exp'            #Exp
      | 'gelu'           #Gelu
      | 'sigmoid'        #Sigmoid
      | 'linear'         #Linear
      | 'softmax'        #Softmax
      | 'tanh'           #Tanh
      | 'relu'           #Relu
      ;

tensor : (exp 'x')* exp #Tensor
       ;

exp : NUM         #Const
    | exp OP exp  #Op
    | '(' exp ')' #Group
    ;

activation : 'elu'     #Elu
           | 'exp'     #Exp
           | 'gelu'    #Gelu
           | 'sigmoid' #Sigmoid
           | 'linear'  #Linear
           | 'softmax' #Softmax
           | 'tanh'    #Tanh
           | 'relu'    #Relu
           ;

ID : [a-zA-Z]+ ;
NUM : [0-9]+ ;
OP : '+'|'-'|'*'|'/' ;
ESPACOS : (' '|'\n') -> skip ; 