package edu.uiowa.slis.BIBFRAME.ProducerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProducerProvisionMadeAvailable extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProducerProvisionMadeAvailable currentInstance = null;
	private static final Log log = LogFactory.getLog(ProducerProvisionMadeAvailable.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProducerProvisionMadeAvailableIterator theProducerProvisionMadeAvailableIterator = (ProducerProvisionMadeAvailableIterator)findAncestorWithClass(this, ProducerProvisionMadeAvailableIterator.class);
			pageContext.getOut().print(theProducerProvisionMadeAvailableIterator.getMadeAvailable());
		} catch (Exception e) {
			log.error("Can't find enclosing ProducerProvision for madeAvailable tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for madeAvailable tag ");
		}
		return SKIP_BODY;
	}
}

