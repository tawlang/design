package com.company.tl.command;

/**
 * Created by taolang on 2017/4/21.
 */
public abstract class Command {


    public abstract void execute();


    protected RequirementGroup rg = new RequirementGroup();

    protected ArtGroup pg = new ArtGroup();

    protected CodeGroup cg = new CodeGroup();

}
