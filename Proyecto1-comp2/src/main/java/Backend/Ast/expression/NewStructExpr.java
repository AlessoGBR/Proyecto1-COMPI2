package Backend.Ast.expression;

import Backend.Ast.AstVisitor;
import java.util.List;

public class NewStructExpr extends Expression {
    private final String structName;
    private final List<Expression> values;

    public NewStructExpr(String structName, List<Expression> values, int line, int column) {
        super(line, column);
        this.structName = structName;
        this.values = values != null ? values : List.of();
    }

    public String getStructName() {
        return structName;
    }

    public List<Expression> getValues() {
        return values;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitNewStructExpr(this, context);
    }
}

