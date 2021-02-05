package lang.ast.cmd;

import lang.ast.NodeVisitor;
import lang.ast.expr.Expr;
import lang.ast.expr.Location;

public class Read extends Cmd { 
    private Location e;
    
    public Read(Location e){
        this.e = e;
    }
    
    public Expr getExpr(){ return e;}
    
    public void accept(NodeVisitor v){ v.visit(this);}
}
