package Backend.Ast.declaration;

import Backend.Ast.AstVisitor;
import Backend.Ast.statement.BlockStmt;
import java.util.List;

public class ConstructorDecl extends Declaration {
    private final String className;
    private final List<Parameter> parameters;
    private final BlockStmt body;
    private final boolean isPublic;

    public ConstructorDecl(String className, List<Parameter> parameters, BlockStmt body, boolean isPublic, int line, int column) {
        super(line, column);
        this.className = className;
        this.parameters = parameters != null ? parameters : List.of();
        this.body = body;
        this.isPublic = isPublic;
    }

    public String getClassName() {
        return className;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public BlockStmt getBody() {
        return body;
    }

    public boolean isPublic() {
        return isPublic;
    }

    private int tamanioMarco = 1;

    public int getTamanioMarco() {
        return tamanioMarco;
    }

    public void setTamanioMarco(int tamanioMarco) {
        this.tamanioMarco = tamanioMarco;
    }

    private String etiquetaC3D;

    public String getEtiquetaC3D() {
        return etiquetaC3D;
    }

    public void setEtiquetaC3D(String etiquetaC3D) {
        this.etiquetaC3D = etiquetaC3D;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitConstructorDecl(this, context);
    }
}

