package Backend.Ast.expression;

import Backend.Ast.AstVisitor;
import java.util.List;

public class CallExpr extends Expression {
    private final Expression target; 
    private final String functionName;
    private final List<Expression> arguments;

    public CallExpr(Expression target, String functionName, List<Expression> arguments, int line, int column) {
        super(line, column);
        this.target = target;
        this.functionName = functionName;
        this.arguments = arguments != null ? arguments : List.of();
    }

    public Expression getTarget() {
        return target;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    private Backend.simbolos.Simbolo simboloFuncion;

    public Backend.simbolos.Simbolo getSimboloFuncion() {
        return simboloFuncion;
    }

    public void setSimboloFuncion(Backend.simbolos.Simbolo simboloFuncion) {
        this.simboloFuncion = simboloFuncion;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitCallExpr(this, context);
    }
}

