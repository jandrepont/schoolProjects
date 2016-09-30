#include "complexNumber.cc"

using namespace std;

int main(int argc, char **argv)
{

	complexNumber complex1(4.0, 5.0);
	complexNumber complex2(6.0, 6.0);
	complexNumber complex3(-5.238, 98.123);
	complexNumber complex4(.1234, -6543);
	complexNumber result;
	
	//addition testing
	result = complex1 + complex2;
	complexNumber expected(10.0, 11.0);
	complexTester(result,expected);
	result = complex2 + complex3;
	complexNumber expected2(.762, 104.123);
	complexTester(result, expected2);
	result = complex3 + complex4;
	complexNumber expected3(-5.1146, -6444.877);
	complexTester(result, expected3);
	
	//subtraction testing	
	result = complex1 - complex2;
	complexNumber expected4(-2, -1);
	complexTester(result, expected4);
	result = complex2 - complex3;
	complexNumber expected5(11.238, -92.123);
	complexTester(result, expected5);
	result = complex3 - complex4;
	complexNumber expected6(-5.3614, 6641.123);
	complexTester(result, expected6);

	//multiplication testing	
	result = complex1 * complex2;
	complexNumber expected7(-6, 54);
	complexTester(result, expected7);
	result = complex2 * complex3;
	complexNumber expected8(-620.166, 557.31);
	complexTester(result, expected8);
	result = complex3 * complex4;
	complexNumber expected9(642018.1426308, 34284.3423782);
	complexTester(result, expected9);
	



	
	return 0;

}

