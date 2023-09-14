grammar DummyFlow ;
program : model+ EOF ; 
model : ID '(' tensor layer* ')' ;

layer : 'max' tensor #Max
      | 'avg' tensor #Avg
      | 'drop' NUM   #Dropout
      | 'norm'       #Normalization
      | tensor       #Dense
      | E_OP NUM     #ElementWise
      | T_OP tensor  #TensorWise
      | ID           #Activation
      ;

tensor : (NUM 'x')* NUM ;

ID : [a-zA-Z_]+ ;
NUM : [0-9]+('.'[0-9]+)? ;
E_OP : '+'|'-'|'*'|'/' ;
T_OP : '~>'|'->'|'@'|'&' ;
ESPACOS : (' '|'\n') -> skip ; 