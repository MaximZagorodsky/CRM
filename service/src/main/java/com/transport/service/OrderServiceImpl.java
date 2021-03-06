package com.transport.service;


import com.transport.form.OrderForm;
import com.transport.repository.AddressRepository;
import com.transport.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by 1 on 6/10/2016.
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Override
    @Transactional
    public void addOrder(OrderForm orderForm) {
/*
        Address addressFrom = new Address();
        addressFrom.setZip(orderForm.getZipFrom());
//      addressFrom.setAddressFrom(orderForm.getAddressFrom());
        addressFrom.setFloor(orderForm.getFloor());

        addressFrom = addressRepository.save(addressFrom);

        Address addressTo = new Address();
//      addressTo.setAddressTo(orderForm.getAddressTo());
        addressTo.setZip(orderForm.getZipTo());
        addressTo.setFloor(orderForm.getFloor());

        addressTo = addressRepository.save(addressTo);

        Set<Address> addressSet = new HashSet<>();

        addressSet.add(addressFrom);
        addressSet.add(addressTo);

        Order order = new Order();

        order.setCompany(orderForm.getCompany());
        order.setFullName(orderForm.getFullName());
        order.setAdvertisement(orderForm.getAdvertisement());

        order.setSizeOfMove(orderForm.getSizeOfMove());
        order.setLabor(orderForm.isLabor());

//      order.setAddress(addressSet);

        order.setOrderDay(orderForm.getOrderDate());
      //order.setEstimateDate(orderForm.getEstimateDate());
        order.setBoxDeliveredDate(orderForm.getBoxDeliveredDate());
       // order.setPackageDate(orderForm.getPackageDate());
        // order.setPickUpDate(orderForm.getPickUpDate());

        order.setStored(orderForm.isStored());
        order.setDurationStorage(orderForm.getDurationStorage());

        order.setTruck(orderForm.getTruck());
        order.setMovers(orderForm.getMovers());
        order.setHeavyItem(orderForm.getHeavyItem());
        order.setServiceCharge(orderForm.getServiceCharge());
        order.setShrink(orderForm.getShrink());
        order.setTape(orderForm.getTape());
        order.setBoxQuantity(orderForm.getBoxQuantity());
        order.setDdt(orderForm.getDdt());

        order.setTotalPricePerFirstHours(orderForm.getTotalPricePerFirstHours());
        order.setRateOrFlat(orderForm.getRateOrFlat());
        order.setAddExtra(orderForm.getAddExtra());
        order.setDiscount(orderForm.getDiscount());
        order.setTotalPricePerFirstHours(orderForm.getTotalPricePerFirstHours());

        order.setMail(orderForm.getMail());

        order.setFollowUpDate(orderForm.getFollowUpDate());
        order.setFieldForManagerComments(orderForm.getFieldForManagerComments());
        order.setFieldForSalesmanComments(orderForm.getFieldForSalesmanComments());

        orderRepository.save(order);*/
    }
}
