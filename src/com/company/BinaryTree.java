package com.company;

public class BinaryTree extends Branch {

    public BinaryTree(int key) {
        super(key);
    }


//    добавление элемента
    public Branch insertChild(Branch branch, int newKey) {
        if (branch == null) {
            return new Branch(newKey);
        } else {
            if (newKey < branch.key) {
                branch.leftChild = insertChild(branch.leftChild, newKey);
            } else if (newKey > branch.key) {
                branch.rightChild = insertChild(branch.rightChild, newKey);
            }
        }
        return branch;
    }

//    найти элемент
    public String existValue(Branch branch, int key) {
        if (branch == null) {
            System.out.println("Значение " + key + " НЕ существует.");
            return "";
        }
        else if (key == branch.key) {
            System.out.println("Значение " + key + " существует.");
            return "";
        }
        if (branch.key > key){
            return existValue(branch.leftChild, key);
        }else{
            return existValue(branch.rightChild, key);
        }
    }

//   вывод (inorder)
    public void print(Branch branch) {
        if (branch != null) {
            print(branch.leftChild);
            System.out.print(branch.key);
            print(branch.rightChild);
        }
    }

//удаление элемента
    public Branch remove(Branch branch, int key) {
        if (branch == null) {
            return null;
        }
        if (key == branch.key) {
            if (branch.leftChild == null && branch.rightChild == null) {
                return null;
            }
            else if (branch.leftChild == null) {
                return branch.rightChild;
            }

            else if (branch.rightChild == null) {
                return branch.leftChild;
            }
            else{
                int theKey = findAKey(branch);
                remove(branch, key);
                branch.key = theKey;
                return branch;
            }
        }
        if (key > branch.key) {
            branch.rightChild = remove(branch.rightChild, key);
            return branch;
        } else {
            branch.leftChild = remove(branch.leftChild, key);
            return branch;
        }
    }

//    найти элемент (для удаления)
    private int findAKey(Branch branch) {
        if (branch.leftChild != null){
            return findAKey(branch.leftChild);
        }
        else if (branch.leftChild == null && branch.rightChild != null){
            return findAKey(branch.rightChild);
        }
        return branch.key;
    }


}

