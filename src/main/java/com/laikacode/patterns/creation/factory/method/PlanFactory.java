package com.laikacode.patterns.creation.factory.method;

import java.util.HashMap;

public final class PlanFactory {

    private final HashMap<PlanEnum, Plan> planHashMap;

    private static PlanFactory instance;

    private PlanFactory() throws InstantiationException {
        if(instance == null) throw new InstantiationException();

        this.planHashMap = new HashMap<>();

        planHashMap.put(PlanEnum.BASIC, new BasicPlan());
        planHashMap.put(PlanEnum.INTERMEDIATE, new IntermediatePlan());
        planHashMap.put(PlanEnum.EXPERT, new ExpertPlan());
    }

    public static void createInstance() throws InstantiationException {
        if (instance == null) {
            instance = new PlanFactory();
        }
    }

    public Plan create(PlanEnum plan){
        if (plan == null){
            throw new NullPointerException();
        }

        if (this.planHashMap.containsKey(plan)){
            return planHashMap.get(plan);
        }

        return null;
    }
}
