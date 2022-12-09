#include "stdafx.h"
#include <string>
#include <iostream>


class type_of_id  {
    public:
    enum id_kind{
        id_phone_extension,
        id_age,
        id_house_number
    };
    id_kind id;
    virtual void showData() = 0;
};
class phone_extension : public type_of_id {
    public:
	    unsigned int areaCode;
	    unsigned long sevenDigitNumber;

	    phone_extension(id_kind id,unsigned int areaCode, unsigned long sevenDigitNumber)
	    {
	    	this->id = id;
            this->areaCode = areaCode;
	    	this->sevenDigitNumber = sevenDigitNumber;
	    }
        void showData()
        {

            std::cout << "Phone extension (" << this->areaCode << ") " << this->sevenDigitNumber << "\n";

        }

};
class age : public type_of_id {

    public:
	    unsigned int ageYears;

	    age(id_kind id,unsigned int ageYears)
	    {
	    	this->id = id;
            this->ageYears = ageYears;
	    }
        void showData()
        {

            std::cout << "Age " << this->ageYears << "\n";
        }

} ;
class house_number : public type_of_id {

    public:
	    unsigned long houseNumber;

	    house_number(id_kind id,unsigned long houseNumber)
	    {
	    	this->id = id;
            this->houseNumber = houseNumber;
	    }
        void showData()
        {

            std::cout << "House number " << this->houseNumber << "\n";
        }

} ;

int holdCommandWindow()
{
    std::string str;
    std::cout << "\nHit Enter To End Program ";
    std::getline(std::cin,str);
    return 0;
}

int main() {
    
    phone_extension ph1(type_of_id::id_phone_extension, 313, 4567892);
    phone_extension ph2(type_of_id::id_phone_extension, 800, 3334455);
    age age1(type_of_id::id_age, 39);
    age age2(type_of_id::id_age, 21 );
    house_number hn1(type_of_id::id_house_number, 44842);
    
    type_of_id* data[5];

    data[0] = &ph1;
    data[1] = &ph2;
    data[2] = &age1;
    data[3] = &hn1;
    data[4] = &age2;

    std::cout<<"\n"<< "*** This is implemented using Object Oriented Approach ***"<<"\n"<<"\n";
    for(int i=0;i<5;i++)
    {
        std::cout<<"Element index number "<< i <<" is a ";
        data[i]->showData();
    }
    return holdCommandWindow();

}









// enum name, show inside object, memory waste, unknown number of parameters.
