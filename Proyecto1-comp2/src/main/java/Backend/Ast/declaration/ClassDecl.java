package Backend.Ast.declaration;

import Backend.Ast.AstVisitor;
import Backend.Ast.statement.VarDeclStmt;
import java.util.List;

public class ClassDecl extends Declaration {
    private final String name;
    private final List<VarDeclStmt> attributes;
    private final List<ConstructorDecl> constructors;
    private final List<FunctionDecl> methods;
    private final boolean isPublic;

    public ClassDecl(String name, List<VarDeclStmt> attributes, List<ConstructorDecl> constructors, List<FunctionDecl> methods, boolean isPublic, int line, int column) {
        super(line, column);
        this.name = name;
        this.attributes = attributes != null ? attributes : List.of();
        this.constructors = constructors != null ? constructors : List.of();
        this.methods = methods != null ? methods : List.of();
        this.isPublic = isPublic;
    }

    public String getName() {
        return name;
    }

    public List<VarDeclStmt> getAttributes() {
        return attributes;
    }

    public List<ConstructorDecl> getConstructors() {
        return constructors;
    }

    public List<FunctionDecl> getMethods() {
        return methods;
    }

    public boolean isPublic() {
        return isPublic;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitClassDecl(this, context);
    }
}

