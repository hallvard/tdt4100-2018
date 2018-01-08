<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:fv="platform:/plugin/no.hal.learning.execise.model/model/fv.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="Java classes">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Edit source code for Java classes."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" resourcePath="/testjex/src/*" className="*"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Launch Java classes."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="*"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run JUnit tests."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="*"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Tool usage">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Handle debug events."/>
        <a xsi:type="workbench:DebugEventAnswer" elementId="*" action="*.*"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use debug commands"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="*" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use editors and views"/>
        <a xsi:type="workbench:PartTaskAnswer" elementId="*" action="*"/>
      </tasks>
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals>
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1513768104412" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="40" className="objectstructures.Card">
          <edit xsi:type="exercise:StringEdit" storedString="package objectstructures;&#xA;&#xA;public class Card {&#xA;&#xA;&#x9;private char suit;&#xA;&#x9;private int face;&#xA;&#xA;&#x9;public Card(char suit, int face) {&#xA;&#x9;&#x9;if (&quot;SHDC&quot;.indexOf(suit) &lt; 0) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;Suit must be one of S, H, D or C, but was &quot; + suit);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (face &lt; 1 || face > 13) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;Suit must be one of S, H, D or C, but was &quot; + suit);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;this.suit = suit;&#xA;&#x9;&#x9;this.face = face;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;/*&#xA;&#x9; * Returns the suit, S, H, D or C&#xA;&#x9; */&#xA;&#x9;public char getSuit() {&#xA;&#x9;&#x9;return suit;&#xA;&#x9;}&#xA;&#xA;&#x9;/*&#xA;&#x9; * Returns the face&#xA;&#x9; */&#xA;&#x9;public int getFace() {&#xA;&#x9;&#x9;return face;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public String toString() {&#xA;&#x9;&#x9;return String.format(&quot;%s%s&quot;, suit, face);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;System.out.println(new Card('D', 4));&#xA;&#x9;}&#xA;}&#xA;"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="33.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1513768122912" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="40" className="objectstructures.Card">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="S" edit="/1/@proposals.0/@proposals.0/@attempts.0/@edit" start="738" end="-14"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="33.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1513768826052" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="40" className="objectstructures.Card">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="&quot;Card: &quot; + " edit="/1/@proposals.0/@proposals.0/@attempts.1/@edit" start="728" end="-25"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="33.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1513768861979" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="40" className="objectstructures.Card">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString=" (spades)" edit="/1/@proposals.0/@proposals.0/@attempts.2/@edit" start="733" end="-31"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="33.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1513768873724" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="40" errorCount="1" className="objectstructures.Card">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="n" edit="/1/@proposals.0/@proposals.0/@attempts.3/@edit" start="729" end="-24"/>
          <markers xsi:type="jdt:JdtMarkerInfo" lineNumber="38" charStart="728" charEnd="747" severity="2" problemCategory="20" problemType="1610612995"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="33.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1513768876144" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="40" className="objectstructures.Card">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="n" edit="/1/@proposals.0/@proposals.0/@attempts.4/@edit" start="728" end="-24"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="33.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1513769136007" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="41" className="objectstructures.Card">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="&#x9;" edit="/1/@proposals.0/@proposals.0/@attempts.5/@edit" start="748" end="-44"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="34.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1513769202374" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="42" className="objectstructures.Card">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="&#x9;" edit="/1/@proposals.0/@proposals.0/@attempts.6/@edit" start="788" end="-44"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="35.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1513769222997" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="40" className="objectstructures.Card">
          <edit xsi:type="exercise:ReplaceSubstringEdit" storedString="}" edit="/1/@proposals.0/@proposals.0/@attempts.7/@edit" start="748" end="-4"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="33.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1515145680154" resourcePath="/testjex/src/objectstructures/Card.java" sizeMeasure="40" className="objectstructures.Card">
          <edit xsi:type="exercise:ReplaceSubstringEdit" edit="/1/@proposals.0/@proposals.0/@attempts.8/@edit" start="752"/>
          <metrics key="conditionalCounters">
            <value xsi:type="fv:FeatureList">
              <features key="IfStatement" value="2.0"/>
              <features key="InfixExpression" value="1.0"/>
              <features key="conditionalCount" value="3.0"/>
            </value>
          </metrics>
          <metrics key="tokenCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="SimpleName" value="28.0"/>
                <features key="MethodInvocation" value="2.0"/>
                <features key="FieldDeclaration" value="2.0"/>
                <features key="Assignment" value="2.0"/>
                <features key="SimpleType" value="3.0"/>
                <features key="IfStatement" value="2.0"/>
                <features key="ThisExpression" value="2.0"/>
                <features key="InfixExpression.||" value="1.0"/>
                <features key="VariableDeclarationFragment" value="2.0"/>
                <features key="InfixExpression" value="6.0"/>
                <features key="ReturnStatement" value="3.0"/>
                <features key="PrimitiveType" value="6.0"/>
                <features key="ThrowStatement" value="2.0"/>
                <features key="Modifier" value="7.0"/>
                <features key="ClassInstanceCreation" value="2.0"/>
                <features key="InfixExpression.>" value="1.0"/>
                <features key="SingleVariableDeclaration" value="2.0"/>
                <features key="MethodDeclaration" value="4.0"/>
                <features key="InfixExpression.&lt;" value="2.0"/>
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="StringLiteral" value="4.0"/>
                <features key="ExpressionStatement" value="2.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="Block" value="6.0"/>
                <features key="InfixExpression.+" value="2.0"/>
                <features key="FieldAccess" value="2.0"/>
                <features key="NumberLiteral" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="nameCounters">
            <value xsi:type="fv:DelegatedFeatures" name="tokens">
              <features xsi:type="fv:FeatureList">
                <features key="FieldDeclaration.private" value="2.0"/>
                <features key="MethodDeclaration.public" value="4.0"/>
                <features key="java.lang.String.format()" value="1.0"/>
                <features key="char" value="3.0"/>
                <features key="TypeDeclaration.public" value="1.0"/>
                <features key="java.lang.String.indexOf()" value="1.0"/>
                <features key="java.lang.String" value="2.0"/>
                <features key="java.lang.IllegalArgumentException" value="2.0"/>
                <features key="int" value="3.0"/>
              </features>
            </value>
          </metrics>
          <metrics key="lineCount">
            <value xsi:type="fv:DelegatedFeatures" name="lines">
              <features xsi:type="fv:FeatureList">
                <features key="lines" value="33.0"/>
              </features>
            </value>
          </metrics>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a">
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513717603677" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513762473491" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513762485243" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513762605950" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513762644724" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513762672919" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513762779995" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513762834941" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513763099583" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513765437349" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput></consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513766210745" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>C4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513766286280" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>C4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513766362310" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>C4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513767755950" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>C4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513768085186" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput></consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513768113607" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>D4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513768128351" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513768830648" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput></consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513768847103" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>Card: S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513768865971" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>Card (spades): S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513768880550" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513769129844" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513769139679" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513769198972" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
S4
</consoleOutput>
        </attempts>
        <attempts xsi:type="jdt:JdtLaunchEvent" timestamp="1513769204429" mode="run" className="objectstructures.Card">
          <launchAttrNames>org.eclipse.jdt.launching.MAIN_TYPE</launchAttrNames>
          <launchAttrNames>org.eclipse.jdt.launching.PROJECT_ATTR</launchAttrNames>
          <launchAttrValues>objectstructures.Card</launchAttrValues>
          <launchAttrValues>testjex</launchAttrValues>
          <consoleOutput>S4
S4
S4
</consoleOutput>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.2/@q" answer="/0/@parts.0/@tasks.2/@a"/>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a">
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513717310781" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513717603676" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513762375725" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513762473485" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513762485243" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513762605949" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513762644724" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513762672919" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513762779994" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513762834940" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513763099582" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513763730573" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513765428158" elementId="org.eclipse.ui.file.refresh" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513765437343" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513765619417" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513766030679" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513766210744" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513766238581" elementId="org.eclipse.ui.edit.findIncremental" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513766286280" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513766362310" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513766482417" elementId="org.eclipse.ui.edit.findIncremental" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513766495941" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513766873951" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513767742398" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513767755949" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513767787534" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768085180" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768104432" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768113606" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768122924" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768128350" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768331378" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768826100" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768830642" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768847102" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768861997" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768865971" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768869003" elementId="org.eclipse.ui.edit.text.select.wordPrevious" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768869225" elementId="org.eclipse.ui.edit.text.select.wordPrevious" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768869592" elementId="org.eclipse.ui.edit.text.select.wordPrevious" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768870240" elementId="org.eclipse.ui.edit.text.goto.wordPrevious" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768870736" elementId="org.eclipse.ui.edit.text.select.wordNext" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768870904" elementId="org.eclipse.ui.edit.text.select.wordNext" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768871056" elementId="org.eclipse.ui.edit.text.select.wordNext" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768871216" elementId="org.eclipse.ui.edit.text.select.wordNext" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768871368" elementId="org.eclipse.ui.edit.text.select.wordNext" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768871711" elementId="org.eclipse.ui.edit.text.select.wordNext" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768873803" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768876161" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513768880550" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769061917" elementId="org.eclipse.jdt.ui.navigate.open.type" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769129844" elementId="org.eclipse.jdt.debug.ui.localJavaShortcut.run" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769134924" elementId="org.eclipse.ui.edit.text.copyLineDown" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769136031" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769201629" elementId="org.eclipse.ui.edit.text.copyLineDown" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769202387" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769221933" elementId="org.eclipse.ui.edit.text.delete.line" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769222365" elementId="org.eclipse.ui.edit.text.delete.line" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769223031" elementId="org.eclipse.ui.file.save" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513769253020" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513772838167" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513772933131" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513773334680" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513774831782" elementId="org.eclipse.ui.views.showView" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513774831782" elementId="org.eclipse.ui.views.showView" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513774842882" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513775049804" elementId="org.eclipse.ui.views.showView" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513775049804" elementId="org.eclipse.ui.views.showView" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1513775368847" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1515146410496" elementId="AUTOGEN:::org.eclipse.jdt.debug.CompilationUnitEditor.BreakpointRulerActions/org.eclipse.jdt.debug.ui.actions.ManageBreakpointRulerAction" action="executeSuccess"/>
        <attempts xsi:type="workbench:WorkbenchTaskEvent" timestamp="1515148984080" elementId="org.eclipse.ui.file.exit" action="executeSuccess"/>
      </proposals>
      <proposals xsi:type="workbench:PartTaskProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a">
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513717238743" elementId="no.hal.learning.exercise.views.ExerciseView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513717238794" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513717238880" elementId="org.eclipse.ui.views.PropertySheet" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513717238941" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513717240422" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513717323280" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513717323283" elementId="org.eclipse.ui.console.ConsoleView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762375315" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762375334" elementId="org.eclipse.ui.views.ResourceNavigator" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762375359" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762375367" elementId="no.hal.learning.exercise.views.ExerciseView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762375405" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762375408" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762375461" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762375471" elementId="org.eclipse.ui.views.PropertySheet" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762375478" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762460493" elementId="no.hal.learning.exercise.views.ExerciseView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762460546" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762460606" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762460680" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762462024" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762873150" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513762873172" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763094645" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763094681" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763730166" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763730182" elementId="org.eclipse.ui.views.ResourceNavigator" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763730206" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763730214" elementId="no.hal.learning.exercise.views.ExerciseView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763730253" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763730256" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763730287" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513763730296" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765397087" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765397149" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765397208" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765398527" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765401327" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765401374" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765403141" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765403156" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765408228" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765408253" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765413340" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765413357" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765422878" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765422901" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765424163" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765424176" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765432843" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="opened" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765432894" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765432896" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765432921" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765444325" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765444346" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765451609" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765451611" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765451631" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765456770" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765456783" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765461704" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765461710" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765463287" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765463302" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765469635" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765469659" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765469682" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765469693" elementId="org.eclipse.ui.DefaultTextEditor" action="closed" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765471022" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765471034" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765477016" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765477032" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765521802" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765521808" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765522146" elementId="org.eclipse.ui.DefaultTextEditor" action="opened" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765522168" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765522171" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765522196" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765615489" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765615499" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765616526" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765616540" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765622799" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765622809" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765629863" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765629877" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765632425" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765632434" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765634107" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765634120" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765636363" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765636380" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765701041" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765701055" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765702664" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513765702674" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766017227" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766017261" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766022750" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766022766" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766032342" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766032353" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766196064" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766196081" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766203352" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766203365" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766206159" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766206161" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766206177" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766215861" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766215863" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766215875" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766222505" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766222523" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766237467" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766237479" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766281320" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766281322" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766281336" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766289753" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766289777" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766291279" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766291282" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766291305" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766358868" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766358870" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766358885" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766477388" elementId="org.eclipse.ui.views.ResourceNavigator" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766477403" elementId="org.eclipse.ui.views.ResourceNavigator" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766477404" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766477416" elementId="org.eclipse.ui.views.ResourceNavigator" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766479994" elementId="org.eclipse.ui.DefaultTextEditor" action="opened" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766480012" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766480014" elementId="org.eclipse.ui.views.ResourceNavigator" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766480031" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495244" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495290" elementId="org.eclipse.jdt.ui.PackageExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495299" elementId="org.eclipse.ui.views.ResourceNavigator" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495375" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495381" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495546" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495587" elementId="no.hal.learning.exercise.views.ExerciseView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495671" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495691" elementId="org.eclipse.ui.DefaultTextEditor" action="closed" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495704" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766495705" elementId="org.eclipse.ui.DefaultTextEditor" action="closed" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766509048" elementId="no.hal.learning.exercise.views.ExerciseView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766509096" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766509167" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766509210" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766510379" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766541884" elementId="no.hal.learning.exercise.presentation.ExerciseEditorID" action="opened" inputUri="platform:/resource/testjex/tests/objectstructures/FeatureList-ragnar.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766541904" elementId="no.hal.learning.exercise.presentation.ExerciseEditorID" action="broughtToTop" inputUri="platform:/resource/testjex/tests/objectstructures/FeatureList-ragnar.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766541913" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766541930" elementId="no.hal.learning.exercise.presentation.ExerciseEditorID" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/FeatureList-ragnar.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766541956" elementId="org.eclipse.ui.DefaultTextEditor" action="closed" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766546064" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="opened" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766546122" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766546129" elementId="no.hal.learning.exercise.presentation.ExerciseEditorID" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/FeatureList-ragnar.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766546152" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766546196" elementId="no.hal.learning.exercise.presentation.ExerciseEditorID" action="closed" inputUri="platform:/resource/testjex/tests/objectstructures/FeatureList-ragnar.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766549131" elementId="org.eclipse.ui.DefaultTextEditor" action="opened" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766549165" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766549169" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766549184" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766871676" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766871682" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766871700" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766871725" elementId="org.eclipse.ui.DefaultTextEditor" action="closed" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766873586" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766873600" elementId="org.eclipse.ui.views.ResourceNavigator" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766873612" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766873616" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766873636" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766873643" elementId="no.hal.learning.exercise.views.ExerciseView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766873681" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513766873683" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767695734" elementId="no.hal.learning.exercise.views.ExerciseView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767695782" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767695859" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767695935" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767697301" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767726366" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767726384" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767728671" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767728692" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767737629" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="opened" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767737655" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767737658" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767737680" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767787110" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767787127" elementId="org.eclipse.ui.views.ResourceNavigator" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767787153" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767787163" elementId="no.hal.learning.exercise.views.ExerciseView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767787187" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767787226" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767787228" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767787250" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513767787259" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768073635" elementId="no.hal.learning.exercise.views.ExerciseView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768073682" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768073746" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768073813" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768075345" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768080197" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768080217" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768081089" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768081109" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768208673" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768208739" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768213215" elementId="org.eclipse.jdt.ui.PackageExplorer" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768213219" elementId="org.eclipse.jdt.ui.PackageExplorer" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768213229" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768213242" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768218251" elementId="org.eclipse.ui.DefaultTextEditor" action="opened" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768218268" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768218273" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768218292" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331021" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331035" elementId="org.eclipse.ui.views.ResourceNavigator" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331044" elementId="org.eclipse.jdt.ui.PackageExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331063" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331068" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331089" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331097" elementId="no.hal.learning.exercise.views.ExerciseView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331117" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331145" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768331147" elementId="org.eclipse.ui.DefaultTextEditor" action="closed" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768804139" elementId="no.hal.learning.exercise.views.ExerciseView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768804186" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768804240" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768804287" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768805496" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768812126" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768812156" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768819117" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="opened" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768819214" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768819219" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513768819253" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513769252720" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513769252737" elementId="org.eclipse.jdt.ui.PackageExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513769252762" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513769252770" elementId="no.hal.learning.exercise.views.ExerciseView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513769252783" elementId="org.eclipse.ui.DefaultTextEditor" action="closed" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513769252806" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513769252808" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513769252829" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513769252838" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772517596" elementId="no.hal.learning.exercise.views.ExerciseView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772517642" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772517702" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772517772" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772519343" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772522115" elementId="no.hal.learning.exercise.adm.LoggedExView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772522122" elementId="no.hal.learning.exercise.adm.LoggedExView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772522139" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772522144" elementId="no.hal.learning.exercise.adm.LoggedExView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772837714" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772837734" elementId="org.eclipse.jdt.ui.PackageExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772837749" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772837753" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772837778" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772837818" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772837858" elementId="no.hal.learning.exercise.views.ExerciseView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772837898" elementId="no.hal.learning.exercise.adm.LoggedExView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772837898" elementId="no.hal.learning.exercise.adm.LoggedExView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772850941" elementId="no.hal.learning.exercise.adm.LoggedExView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772850984" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772851035" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772851095" elementId="no.hal.learning.exercise.adm.LoggedExView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772852311" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772932712" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772932743" elementId="org.eclipse.jdt.ui.PackageExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772932753" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772932758" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772932773" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772932811" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772932821" elementId="no.hal.learning.exercise.adm.LoggedExView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513772932822" elementId="no.hal.learning.exercise.adm.LoggedExView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773110540" elementId="no.hal.learning.exercise.adm.LoggedExView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773110595" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773110670" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773110749" elementId="no.hal.learning.exercise.adm.LoggedExView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773111957" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773334220" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773334248" elementId="org.eclipse.jdt.ui.PackageExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773334259" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773334264" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773334281" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773334312" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773334321" elementId="no.hal.learning.exercise.adm.LoggedExView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513773334321" elementId="no.hal.learning.exercise.adm.LoggedExView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774802639" elementId="no.hal.learning.exercise.adm.LoggedExView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774802680" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774802735" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774802795" elementId="no.hal.learning.exercise.adm.LoggedExView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774804056" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774840780" elementId="no.hal.learning.exercise.adm.LoggedExView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774840823" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774842582" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774842598" elementId="org.eclipse.jdt.ui.PackageExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774842609" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774842614" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774842622" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774842626" elementId="no.hal.learning.exercise.adm.LoggedExView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774842642" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774842644" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774901227" elementId="no.hal.learning.exercise.adm.LoggedExView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774901263" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774901313" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774901370" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513774903727" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775049632" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775049752" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775049754" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775049795" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775058202" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775058207" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775058973" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775058974" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775059701" elementId="org.eclipse.ui.console.ConsoleView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775059712" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775059719" elementId="org.eclipse.ui.console.ConsoleView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775059737" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775059742" elementId="org.eclipse.ui.console.ConsoleView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775059756" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775062303" elementId="no.hal.confluence.ui.views.ConfluenceWikiOverView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775062306" elementId="no.hal.confluence.ui.views.ConfluenceWikiOverView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775062318" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775062334" elementId="no.hal.confluence.ui.views.ConfluenceWikiOverView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775106650" elementId="no.hal.confluence.ui.views.ConfluenceWikiOverView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775106655" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775133060" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775133075" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775156239" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="opened" inputUri="platform:/resource/no.hal.learning.exercise.examples/src/no/hal/learning/exercise/examples/Timestamp.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775156245" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/no.hal.learning.exercise.examples/src/no/hal/learning/exercise/examples/Timestamp.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775235986" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775235992" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368491" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368508" elementId="org.eclipse.jdt.ui.PackageExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368523" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368527" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368546" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368572" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/no.hal.learning.exercise.examples/src/no/hal/learning/exercise/examples/Timestamp.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368591" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368595" elementId="no.hal.confluence.ui.views.ConfluenceWikiOverView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368618" elementId="no.hal.learning.exercise.adm.LoggedExView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368625" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1513775368625" elementId="no.hal.learning.sharing.ui.views.PublishingView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144911797" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144911874" elementId="no.hal.confluence.ui.views.ConfluenceWikiOverView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144911948" elementId="org.eclipse.ui.console.ConsoleView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144911994" elementId="org.eclipse.ui.navigator.ProjectExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144913101" elementId="org.eclipse.ui.views.ProblemView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144918442" elementId="org.eclipse.ui.views.ResourceNavigator" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144918445" elementId="org.eclipse.ui.views.ResourceNavigator" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144918461" elementId="org.eclipse.ui.navigator.ProjectExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144918470" elementId="org.eclipse.ui.views.ResourceNavigator" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144923080" elementId="org.eclipse.jdt.ui.PackageExplorer" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144923082" elementId="org.eclipse.jdt.ui.PackageExplorer" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144923092" elementId="org.eclipse.ui.views.ResourceNavigator" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144923109" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144929403" elementId="no.hal.learning.exercise.views.ExerciseView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144929405" elementId="no.hal.learning.exercise.views.ExerciseView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144929424" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515144929439" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145105282" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145105289" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145108343" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145108350" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145183812" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="opened" inputUri="/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145183840" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145183845" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145183881" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145186561" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145186569" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145210064" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="opened" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145210077" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145210100" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145300973" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145300982" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145300986" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145365316" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145365320" elementId="no.hal.learning.exercise.views.ExerciseView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145365351" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145396375" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="opened" inputUri="/objectstructures/Partner.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145396376" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="/objectstructures/Partner.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145396391" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145396419" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="/objectstructures/Partner.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145404887" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="/objectstructures/Partner.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145404895" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145434212" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145434221" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="/objectstructures/Partner.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145436557" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145436565" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145436572" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145511318" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145511319" elementId="no.hal.learning.exercise.views.ExerciseView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145511334" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145624210" elementId="org.eclipse.ui.views.ResourceNavigator" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145624217" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145624231" elementId="org.eclipse.ui.views.ResourceNavigator" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145637617" elementId="org.eclipse.ui.DefaultTextEditor" action="opened" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145637629" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145637637" elementId="org.eclipse.ui.views.ResourceNavigator" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145637655" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145680201" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="opened" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145680236" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145680241" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145680258" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145693175" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145693180" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145693190" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145824919" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145824923" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145824938" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145826406" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="opened"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145826408" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145826416" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515145826420" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146185777" elementId="org.eclipse.ui.DefaultTextEditor" action="broughtToTop" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146185782" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146185795" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146243570" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146243576" elementId="org.eclipse.ui.views.ResourceNavigator" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146252762" elementId="org.eclipse.ui.views.ResourceNavigator" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146252766" elementId="no.hal.learning.exercise.views.ExerciseView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146263696" elementId="org.eclipse.jdt.ui.PackageExplorer" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146263702" elementId="no.hal.learning.exercise.views.ExerciseView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146263714" elementId="org.eclipse.jdt.ui.PackageExplorer" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146311431" elementId="org.eclipse.ui.views.ResourceNavigator" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146311436" elementId="org.eclipse.jdt.ui.PackageExplorer" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146311443" elementId="org.eclipse.ui.views.ResourceNavigator" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146365905" elementId="org.eclipse.ui.views.ResourceNavigator" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146365923" elementId="org.eclipse.ui.DefaultTextEditor" action="activated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146366011" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="broughtToTop" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146366018" elementId="org.eclipse.ui.DefaultTextEditor" action="deactivated" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146366032" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146366053" elementId="org.eclipse.ui.DefaultTextEditor" action="closed" inputUri="platform:/resource/testjex/.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146484806" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="broughtToTop"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146484814" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515146484824" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="activated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148981257" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="deactivated"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148981271" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="activated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983496" elementId="org.eclipse.pde.runtime.RegistryBrowser" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983525" elementId="org.eclipse.jdt.ui.PackageExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983534" elementId="org.eclipse.ui.navigator.ProjectExplorer" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983543" elementId="org.eclipse.ui.views.ResourceNavigator" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983583" elementId="org.eclipse.ui.views.ProblemView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983587" elementId="org.eclipse.ui.console.ConsoleView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983674" elementId="no.hal.confluence.ui.views.ConfluenceWikiOverView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983686" elementId="no.hal.learning.exercise.jdt.ui.MetricsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983706" elementId="no.hal.learning.exercise.views.ExerciseView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983722" elementId="no.hal.learning.exercise.adm.BbSubmissionsView" action="closed"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983729" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/CardDeck.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983742" elementId="org.eclipse.ui.DefaultTextEditor" action="closed" inputUri="platform:/resource/testjex/tests/objectstructures/Card.ex"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983752" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="deactivated" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
        <attempts xsi:type="workbench:PartTaskEvent" timestamp="1515148983753" elementId="org.eclipse.jdt.ui.CompilationUnitEditor" action="closed" inputUri="platform:/resource/testjex/src/objectstructures/Card.java"/>
      </proposals>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
