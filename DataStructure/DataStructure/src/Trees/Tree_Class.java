package Trees;
public class Tree_Class
{
    Tnode root;
    void insert(Tnode r,Tnode n)//r:root ref n:new node
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);
            }
        }
        System.out.println(n.data+" inserted in tree");
    }
    void inorder(Tnode r)
    {
        if(r!=null)//LPR
        {
            inorder(r.left);//L
            System.out.print(r.data+",");//P
            inorder(r.right);//R
        }
    }
    void preorder (Tnode r)
    {
        if(r!=null)//LPR
        {
        	System.out.print(r.data+",");
            preorder(r.left);//L
            //P
            preorder(r.right);//R
        }
    }
    void postorder (Tnode r)
    {
        if(r!=null)//LPR
        {
            postorder(r.right);//L
            //P
            postorder(r.right);//R
            System.out.print(r.data+",");
        }
    }
    boolean search(int key,Tnode r) {
    	if(r==null) {
    		return false;
    	}
    	else if(key <r.data) 
    		return search(key,r.left);
    	
    	else if(key>r.data) 
    	   return search(key,r.right);
    	else
    	return true;
    }
    
    int countnodes(Tnode root) {
    	if(root!=null)
    	return 0;
    	else {
    	
    		int nodel=countnodes(root.left);
    		int noder=countnodes(root.right);
    		return 1+nodel+noder;
    	}
    	
    }
    int countnodesleaf(Tnode root) {
    	if(root!=null)
    	return 0;
    	else {
    	
    		int nodel=countnodesleaf(root.left=null);
    		int noder=countnodesleaf(root.right=null);
    		return 1+nodel+noder;
    	}
    	
    	
    }
}