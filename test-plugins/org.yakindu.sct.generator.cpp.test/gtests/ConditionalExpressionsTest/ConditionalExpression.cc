/* Generated by YAKINDU Statechart Tools code generator. */
#include <string>
#include "gtest/gtest.h"
#include "ConditionalExpressions.h"
#include "sc_runner.h"
#include "sc_types.h"



static ConditionalExpressions* statechart;

//! The timers are managed by a timer service. */
static SctUnitRunner * runner;

class ConditionalExpression : public ::testing::Test{
	protected:
	virtual void SetUp() {
		statechart = new ConditionalExpressions();
		statechart->init();
		runner = new SctUnitRunner(
			statechart,
			false,
			200
		);
	}
	virtual void TearDown() {
		delete statechart;
		delete runner;
	}
};


TEST_F(ConditionalExpression, ConditionalExpressionTest) {
	
	statechart->enter();
	
	EXPECT_TRUE(statechart->isStateActive(ConditionalExpressions::main_region_A));
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_condition()== 1l);
	
	statechart->getDefaultSCI()->raise_e();
	
	runner->proceed_cycles(1);
	
	EXPECT_TRUE(statechart->isStateActive(ConditionalExpressions::main_region_B));
	
	EXPECT_TRUE(statechart->getDefaultSCI()->get_condition()== 2l);
	
}
