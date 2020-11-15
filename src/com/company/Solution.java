package com.company;

public class Solution {
    private double x;
    private double a = 0;
    private double b = 10;
    private double e = 0.001;

    private double equationSolution(double x){
        return Math.cos(x*x*x*x*x) + x*x*x*x - 345.3*x - 23;
    }

//    условие на сходимость
    private Boolean convergence(){
        double fa = equationSolution(a);
        double fb = equationSolution(b);
        if (fa*fb<0){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

//    Действие по методу
    private Boolean methodActions(){
        x = (a+b)/2;
        double solution = equationSolution(x);
        double ak = equationSolution(a);
        if (Math.abs(solution) < e){
            return Boolean.TRUE;
        }
        if (ak *solution < 0){
            b = x;
        }
        else{
            a = x;
        }
        return methodActions();
    }

//    объединение действий
    public double [] solution(){
        if (convergence() == Boolean.TRUE){
            if (methodActions() == Boolean.TRUE){
                double [] result = new double[] {a,b};
                return result;
            }
        }
        double [] result = new double[] {'-'};
        return result;
    }



}
