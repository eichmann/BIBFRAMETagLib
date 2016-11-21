package edu.uiowa.slis.BIBFRAME.ProducerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProducerProvisionAtLocation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProducerProvisionAtLocation currentInstance = null;
	private static final Log log = LogFactory.getLog(ProducerProvisionAtLocation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProducerProvisionAtLocationIterator theProducerProvisionAtLocationIterator = (ProducerProvisionAtLocationIterator)findAncestorWithClass(this, ProducerProvisionAtLocationIterator.class);
			pageContext.getOut().print(theProducerProvisionAtLocationIterator.getAtLocation());
		} catch (Exception e) {
			log.error("Can't find enclosing ProducerProvision for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

