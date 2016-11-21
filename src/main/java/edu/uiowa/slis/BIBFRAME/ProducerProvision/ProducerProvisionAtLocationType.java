package edu.uiowa.slis.BIBFRAME.ProducerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProducerProvisionAtLocationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProducerProvisionAtLocationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProducerProvisionAtLocationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProducerProvisionAtLocationIterator theProducerProvisionAtLocationIterator = (ProducerProvisionAtLocationIterator)findAncestorWithClass(this, ProducerProvisionAtLocationIterator.class);
			pageContext.getOut().print(theProducerProvisionAtLocationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ProducerProvision for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

