package session12.part1;

@FunctionalInterface
public interface IntFunction {

    Integer apply(Integer a);

//    default IntFunction compose(IntFunction before){
//        return a->apply(before.apply(a));
//    }
    //fog(x)
    default IntFunction compose(IntFunction before){
        return a-> {
            Integer applyFirstFunction = before.apply(a);//g(a)
            return apply(applyFirstFunction);//f(g(a))
        };
    }
}
