# Entities:

| Entity       | PK                            | FK                        | Attribute                                |
| ------------ | ----------------------------- | ------------------------- | ---------------------------------------- |
| Branch       | br_name                       |                           | br_address                               |
| Exam Room    | exm_rm_num, br_name()         |                           |                                          |
| Owner        | owner_id                      |                           | owner_name, owner_phone_number           |
| Pet          | microchip_num                 | owner_id                  | pet_name, pet_species                    |
| Visit        | vst_num                       | microchip_num, exm_rm_num | vst_date, vst_reason, vst_follow_up_date |
| Veterinarian | vet_id                        | supervisor_id, spot_num   | vet_name, vet_license_num                |
| Assignment   | vet_id(PK/FK), vst_num(PK/FK) |                           | vet_role                                 |
| Parking      | spot_num                      | vet_id                    |                                          |


# Relationships:
Branch (1,1) to (1,N) Exam Room:
- Exam Room gains FK: br_name
- Strong  relationship
Owner (1,1) to (0,N) Pet:
- Pet gains FK: owner_id
- Weak relationship
Pet (1,1) to (0,N) Visit: 
- Visit gains FK: microchip_num
- Weak relationship
Visit (0,N) to (1,1) Exam Room:
- Visit gains FK: exm_rm_num
- Weak relationship
Visit (1,1) to (0,N) Assignment:
- Strong relationship
Veterinarian (1,1) to (0,N) Assignment:
- Strong relationship
Veterinarian (0,N) to (0,1) Veterinarian:
- Veterinarian gains FK: supervisor_id
- Weak relationship
Parking (0,1) to (0,1) Veterinarian
- Parking gains FK: vet_id
- Weak relationship
