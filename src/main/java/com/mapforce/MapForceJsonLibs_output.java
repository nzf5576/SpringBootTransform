package  com.mapforce;
import com.altova.json.*;
import com.altova.json.PropertyRule.NameMatchKind;
import com.altova.json.PropertyGroup.PropertyGroupBehavior;

public class MapForceJsonLibs_output
{
    public static ValueAcceptor[] Schemas = 
    {
            new ValueAcceptor(
                "file:///C:/Users/A054680/Documents/output.schema.json#/@64", 
                null, 
                null,
                null,
                null,
                null,
                new ObjectAcceptor(null, null, new PropertyGroup[]{
                   new PropertyGroup(PropertyGroupBehavior.Succeed, PropertyGroupBehavior.Fail, PropertyGroupBehavior.ContinueWithNext, new PropertyRule[]{
                       new PropertyRule("accountNumber", NameMatchKind.Exact, new Reference("file:///C:/Users/A054680/Documents/output.schema.json#//properties//accountNumber/@16"), null, new Reference("##fail")),
                       new PropertyRule("email", NameMatchKind.Exact, new Reference("file:///C:/Users/A054680/Documents/output.schema.json#//properties//email/@16"), null, new Reference("##fail")),
                       new PropertyRule("firstName", NameMatchKind.Exact, new Reference("file:///C:/Users/A054680/Documents/output.schema.json#//properties//firstName/@16"), null, new Reference("##fail")),
                       new PropertyRule("lastName", NameMatchKind.Exact, new Reference("file:///C:/Users/A054680/Documents/output.schema.json#//properties//lastName/@16"), null, new Reference("##fail")),
                       new PropertyRule("loginID", NameMatchKind.Exact, new Reference("file:///C:/Users/A054680/Documents/output.schema.json#//properties//loginID/@16"), null, new Reference("##fail")),
                       new PropertyRule("personIndex", NameMatchKind.Exact, new Reference("file:///C:/Users/A054680/Documents/output.schema.json#//properties//personIndex/@4"), null, new Reference("##fail")),
                       new PropertyRule("phone", NameMatchKind.Exact, new Reference("file:///C:/Users/A054680/Documents/output.schema.json#//properties//phone/@16"), null, new Reference("##fail")),
                       new PropertyRule("routingNumber", NameMatchKind.Exact, new Reference("file:///C:/Users/A054680/Documents/output.schema.json#//properties//routingNumber/@16"), null, new Reference("##fail")),
                   } ),
                   new PropertyGroup(PropertyGroupBehavior.Succeed, PropertyGroupBehavior.Fail, PropertyGroupBehavior.ContinueWithNext, new PropertyRule[]{
                       new PropertyRule("", NameMatchKind.All, new Reference("##fail"), null, null),
                   } ),
                }),
                new AlsoAcceptor[]{}
            ),
            new ValueAcceptor(
                "file:///C:/Users/A054680/Documents/output.schema.json#//properties//accountNumber/@16", 
                new StringAcceptor(null, null, null, null), 
                null,
                null,
                null,
                null,
                null,
                new AlsoAcceptor[]{}
            ),
            new ValueAcceptor(
                "file:///C:/Users/A054680/Documents/output.schema.json#//properties//email/@16", 
                new StringAcceptor(null, null, null, null), 
                null,
                null,
                null,
                null,
                null,
                new AlsoAcceptor[]{}
            ),
            new ValueAcceptor(
                "file:///C:/Users/A054680/Documents/output.schema.json#//properties//firstName/@16", 
                new StringAcceptor(null, null, null, null), 
                null,
                null,
                null,
                null,
                null,
                new AlsoAcceptor[]{}
            ),
            new ValueAcceptor(
                "file:///C:/Users/A054680/Documents/output.schema.json#//properties//lastName/@16", 
                new StringAcceptor(null, null, null, null), 
                null,
                null,
                null,
                null,
                null,
                new AlsoAcceptor[]{}
            ),
            new ValueAcceptor(
                "file:///C:/Users/A054680/Documents/output.schema.json#//properties//loginID/@16", 
                new StringAcceptor(null, null, null, null), 
                null,
                null,
                null,
                null,
                null,
                new AlsoAcceptor[]{}
            ),
            new ValueAcceptor(
                "file:///C:/Users/A054680/Documents/output.schema.json#//properties//personIndex/@4", 
                null, 
                new NumberAcceptor(null, null, null, null, null),
                null,
                null,
                null,
                null,
                new AlsoAcceptor[]{}
            ),
            new ValueAcceptor(
                "file:///C:/Users/A054680/Documents/output.schema.json#//properties//phone/@16", 
                new StringAcceptor(null, null, null, null), 
                null,
                null,
                null,
                null,
                null,
                new AlsoAcceptor[]{}
            ),
            new ValueAcceptor(
                "file:///C:/Users/A054680/Documents/output.schema.json#//properties//routingNumber/@16", 
                new StringAcceptor(null, null, null, null), 
                null,
                null,
                null,
                null,
                null,
                new AlsoAcceptor[]{}
            ),

    };
}    
