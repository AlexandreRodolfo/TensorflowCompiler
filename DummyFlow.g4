grammar DummyFlow ;
program : model* EOF ; 
model : ID '(' (layer (',')?)* layer ')' ;

layer : 'gmax'       #GlobalMax
      | 'gavg'       #GlobalAvg
      | 'max' tensor #Max
      | 'avg' tensor #Avg
      | 'norm'       #Normalization
      | tensor       #Dense
      | E_OP NUM     #ElementWise
      | T_OP tensor  #TensorWise
      | ID           #Activation
      ;

tensor : (NUM 'x')* NUM ;

ID : [a-zA-Z]+ ;
NUM : [0-9]+('.'[0-9]+)? ;
E_OP : '+'|'-'|'*'|'/' ;
T_OP : '~>'|'->'|'@'|'&' ;
ESPACOS : (' '|'\n') -> skip ; 