grammar JavaFlow2;
program : model* EOF ; 
model : ID '(' (layer ',')* layer ')' ;

layer : 'gmax' exp    #GlobalMax
      | 'max' exp     #Max
      | 'gavg' exp    #GlobalAvg
      | 'avg' exp     #Avg
      | 'dense' exp   #Dense
      | 'norm'        #Normalization
      | ID            #Activation
      ;

exp : tensor      #Const
    | exp OP exp  #Op
    | '(' exp ')' #Group
    ;

tensor : (NUM 'x')* NUM ;

ID : [a-zA-Z]+ ;
NUM : [0-9]+('.'[0-9]+)? ;
OP : '+'|'-'|'*'|'/'|'~>'|'->'|'@'|'&' ;
ESPACOS : (' '|'\n') -> skip ; 