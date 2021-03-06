
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "jvisv6PortType", targetNamespace = "http://jvisv6.x-road.eu/producer")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Jvisv6PortType {


    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.Ettekirjutused
     */
    @WebMethod
    @WebResult(name = "ettekirjutused", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public Ettekirjutused ettekirjutused(
        @WebParam(name = "ettekirjutused_search", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        EttekirjutusedSearch body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.IsikuVedurijuhilubaVastus
     */
    @WebMethod
    @WebResult(name = "isikuVedurijuhilubaVastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public IsikuVedurijuhilubaVastus isikuVedurijuhiluba(
        @WebParam(name = "isikuVedurijuhilubaParing", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        IsikuVedurijuhilubaParing body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.VedurijuhiloaEksamVastus
     */
    @WebMethod
    @WebResult(name = "vedurijuhiloaEksamVastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public VedurijuhiloaEksamVastus vedurijuhiloaEksam(
        @WebParam(name = "vedurijuhiloaEksamParing", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        VedurijuhiloaEksamParing body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.VedurijuhiloaKatteandmineVastus
     */
    @WebMethod
    @WebResult(name = "vedurijuhiloaKatteandmineVastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public VedurijuhiloaKatteandmineVastus vedurijuhiloaKatteandmine(
        @WebParam(name = "vedurijuhiloaKatteandmineParing", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        VedurijuhiloaKatteandmineParing body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.PaigaldisLiigidVastus
     */
    @WebMethod(operationName = "paigaldis_liigid")
    @WebResult(name = "paigaldis_liigid_vastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public PaigaldisLiigidVastus paigaldisLiigid(
        @WebParam(name = "paigaldis_liigid_parameetrid", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        PaigaldisLiigidParameetrid body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.PaigaldisOtsingVastus
     */
    @WebMethod(operationName = "paigaldis_otsing")
    @WebResult(name = "paigaldis_otsing_vastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public PaigaldisOtsingVastus paigaldisOtsing(
        @WebParam(name = "paigaldis_otsing_parameetrid", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        PaigaldisOtsingParameetrid body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.KoikKaidukorraldajadVastus
     */
    @WebMethod(operationName = "koik_kaidukorraldajad")
    @WebResult(name = "koik_kaidukorraldajad_vastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public KoikKaidukorraldajadVastus koikKaidukorraldajad(
        @WebParam(name = "koik_kaidukorraldajad_parameetrid", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        KoikKaidukorraldajadParameetrid body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.PadevusulatusVastus
     */
    @WebMethod
    @WebResult(name = "padevusulatus_vastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public PadevusulatusVastus padevusulatus(
        @WebParam(name = "padevusulatus_parameetrid", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        PadevusulatusParameetrid body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.TarbimiskohaKaidukorraldajadVastus
     */
    @WebMethod(operationName = "tarbimiskoha_kaidukorraldajad")
    @WebResult(name = "tarbimiskoha_kaidukorraldajad_vastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public TarbimiskohaKaidukorraldajadVastus tarbimiskohaKaidukorraldajad(
        @WebParam(name = "tarbimiskoha_kaidukorraldajad_parameetrid", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        TarbimiskohaKaidukorraldajadParameetrid body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.TeostatudKontrollidVastus
     */
    @WebMethod(operationName = "teostatud_kontrollid")
    @WebResult(name = "teostatud_kontrollid_vastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public TeostatudKontrollidVastus teostatudKontrollid(
        @WebParam(name = "teostatud_kontrollid_parameetrid", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        TeostatudKontrollidParameetrid body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.PadevustunnistusegaIsikuOtsingVastus
     */
    @WebMethod(operationName = "padevustunnistusega_isiku_otsing")
    @WebResult(name = "padevustunnistusega_isiku_otsing_vastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public PadevustunnistusegaIsikuOtsingVastus padevustunnistusegaIsikuOtsing(
        @WebParam(name = "padevustunnistusega_isiku_otsing_parameetrid", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        PadevustunnistusegaIsikuOtsingParameetrid body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.VedurijuhiloaTaotlusVastus
     */
    @WebMethod
    @WebResult(name = "vedurijuhiloaTaotlusVastus", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public VedurijuhiloaTaotlusVastus vedurijuhiloaTaotlus(
        @WebParam(name = "vedurijuhiloaTaotlusParing", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        VedurijuhiloaTaotlusParing body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.InstallationListResponse
     */
    @WebMethod
    @WebResult(name = "installationListResponse", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public InstallationListResponse installationList(
        @WebParam(name = "installationListRequest", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        InstallationListRequest body);

    /**
     * 
     * @param body
     * @return
     *     returns com.nortal.jroad.starter.client.example.jvis.generated.InstallationChangeListResponse
     */
    @WebMethod
    @WebResult(name = "installationChangeListResponse", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
    public InstallationChangeListResponse installationChangeList(
        @WebParam(name = "installationChangeListRequest", targetNamespace = "http://jvisv6.x-road.eu/producer", partName = "body")
        InstallationChangeListRequest body);

}
