<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="Stock class and StockListener interface">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the StockListener interface."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.StockListener"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the Stock class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.Stock"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the Stock class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="patterns.observable.Stock"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the Stock JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.observable.StockTest"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="StockIndex implements StockListener">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the StockIndex class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.StockIndex"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the StockIndex class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="patterns.observable.StockIndex"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the StockIndex JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.observable.StockIndexTest"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Extra assignments">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the SmartStock class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.SmartStock"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Test the SmartStock class, by running its main method."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="patterns.observable.SmartStock"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the SmartStock JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.observable.SmartStockTest"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Tool usage">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use breakpoints to debug code."/>
        <a xsi:type="workbench:DebugEventAnswer" elementId="patterns.observable.*Stock*" action="suspend.breakpoint"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Over"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepOver" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Into"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepInto" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the Variables view"/>
        <a xsi:type="workbench:PartTaskAnswer" elementId="org.eclipse.debug.ui.VariableView" action="activated"/>
      </tasks>
    </parts>
  </exercise:Exercise>
</xmi:XMI>
