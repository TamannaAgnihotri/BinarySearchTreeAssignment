package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private implementation.Node<E> root;

    public implementation.Node<E> getRoot(){
        return root;
    }

    @Override
    public void insert(E data) {
        implementation.Node<E> node = new implementation.Node<>(data);
        if(isEmpty()){
            root=node;
        }
        else{
            implementation.Node<E> temp= (implementation.Node<E>) root;
            implementation.Node<E> parent=null;
            while(temp!=null){
                parent=temp;
                if(data.compareTo(temp.getData())<=0){
                    temp=temp.getLeft();
                }
                else{
                    temp=temp.getRight();
                }
            }

            if(data.compareTo(parent.getData())<=0){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
    }

    private boolean isEmpty(){
        if(root==null){
            return true;
        }
        return false;
    }

    @Override
    public boolean search(E searchElement) {
        boolean response=false;
        implementation.Node<E> temp = root;
        while(temp!=null){
            if(searchElement.compareTo(temp.getData())==0){
                response=true;
                break;
            }
            else if(searchElement.compareTo(temp.getData())<0){
                temp=temp.getLeft();
            }
            else{
                temp=temp.getRight();
            }
        }
        return response;
    }

    @Override
    public void inOrder(implementation.Node<E> node) {
        if(node!=null){
            inOrder(node.getLeft());
            System.out.print(node.getData()+",");
            inOrder(node.getRight());
        }
    }

    @Override
    public void preOrder(implementation.Node<E> node) {
        if(node!=null){
            System.out.print(node.getData()+",");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    @Override
    public void postOrder(implementation.Node<E> node) {
        if(node!=null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData()+",");
        }
    }

    @Override
    public void reverseInOrder(implementation.Node<E> node) {
        if(node!=null){
            reverseInOrder(node.getRight());
            System.out.print(node.getData()+",");
            reverseInOrder(node.getLeft());
        }
    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(implementation.Node<E> node) {
        return 0;
    }



}
