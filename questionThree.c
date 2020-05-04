void expr(void) {
	 assign_op();
	 while (nextToken == eq || nextToken == plusEq || nextToken == minusEq
		|| nextToken == timesEq || nextToken == divEq || nextToken == modEq
		|| nextToken == andEq || nextToken == caratEq || nextToken == orEq 
		|| nextToken == leftEq || nextToken == rightEq || nextToken == rightrightEq) {
		 lex();
		 assign_op();
	 }
}

void assign_op(void) {
	cond_expr();
	while(nextToken == orBar || nextToken == qMark || nextToken == colon) {
		lex();
		cond_expr();
	}
}

void cond_expr(void) {
	or_expr();
	while(nextToken == doubleOrBar) {
		lex();
		or_expr();
	}
}
	
void or_expr(void) {
	and_expr();
	while(nextToken == doubleAmper) {
		lex();
		and_expr();
	}
}

void and_expr(void) {
	bit_or();
	while(nextToken == bitOr) {
		lex();
		bit_or();
	}
}

void bit_or(void) {
	bit_xor();
	while(nextToken == bitXor) {
		lex();
		bit_xor();
	}
}

void bit_xor(void) {
	bit_and();
	while(nextToken == bitAnd) {
		lex();
		bit_and();
	}
}

void bit_and(void) {
	eq_expr();
	while(nextToken == doubleEq || nextToken == notEq) {
		lex();
		eq_expr();
	}
}

void eq_expr(void) {
	rel_expr();
	while(nextToken == lessThan || nextToken == lessEq || nextToken == greatThan
		|| nextToken == greatEq || nextToken == instaOf) {
		lex();
		rel_expr();
		}
}

void rel_expr(void) {
	shift_expr();
	while(nextToken == dblLess || nextToken == dblMore || nextToken == trpleMore) {
		lex();
		shift_expr();
	}
}

void shift_expr(void) {
	add_cat();
	while(nextToken == plus || nextToken == minus) {
		lex();
		add_cat();
	}
}

void add_cat(void) {
	mult_expr();
	while(nextToken == times || nextToken == divide || nextToken == mod) {
		lex();
		mult_expr();
	}
}

void mult_expr(void) {
	unary_expr();
	while(nextToken == exclPt || nextToken == minusUn || nextToken == addUn) {
		lex();
		unary_expr();
	}
}

void unary_expr(void) {
	prefix();
	while(nextToken == dblMin || nextToken == dblPlus) {
		lex();
		prefix();
	}
}

void prefix(void) {
	postfix();
	while(nextToken == dblMinEnd || nextToken == dblPlusEnd) {
		lex();
		postfix();
	}
}

void postfix(void) {
	paren();
	while(nextToken == id) {
		lex();
		paren();
	}
}

void paren(void) {
	id();
	while(nextToken == letter) {
		lex();
		id();
	}
}

void id(void) {
	int_lit();
	while(nextToken == num) {
		lex();
		int_lit();
	}
}

void int_lit(void) {
	
	
	
	
	
