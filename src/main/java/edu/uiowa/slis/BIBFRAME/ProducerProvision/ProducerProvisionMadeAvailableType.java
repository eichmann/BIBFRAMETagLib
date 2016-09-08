package edu.uiowa.slis.BIBFRAME.ProducerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProducerProvisionMadeAvailableType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProducerProvisionMadeAvailableType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProducerProvisionMadeAvailableType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProducerProvisionMadeAvailableIterator theProducerProvisionMadeAvailableIterator = (ProducerProvisionMadeAvailableIterator)findAncestorWithClass(this, ProducerProvisionMadeAvailableIterator.class);
			pageContext.getOut().print(theProducerProvisionMadeAvailableIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ProducerProvision for madeAvailable tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for madeAvailable tag ");
		}
		return SKIP_BODY;
	}
}

