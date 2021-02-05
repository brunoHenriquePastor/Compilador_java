package lang.ast.types;

import lang.ast.NodeVisitor;

public class TyID extends SType {
    
    private String name;
    public TyID(String name){ this.name = name; }
    
    public String getName(){ return name;}
    
    public void accept(NodeVisitor v){ v.visit(this); }
    
}
