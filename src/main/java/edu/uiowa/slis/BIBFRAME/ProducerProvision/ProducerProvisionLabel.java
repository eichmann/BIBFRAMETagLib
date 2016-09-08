package edu.uiowa.slis.BIBFRAME.ProducerProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProducerProvisionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProducerProvisionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ProducerProvisionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ProducerProvision theProducerProvision = (ProducerProvision)findAncestorWithClass(this, ProducerProvision.class);
			if (!theProducerProvision.commitNeeded) {
				pageContext.getOut().print(theProducerProvision.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ProducerProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ProducerProvision theProducerProvision = (ProducerProvision)findAncestorWithClass(this, ProducerProvision.class);
			return theProducerProvision.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ProducerProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ProducerProvision theProducerProvision = (ProducerProvision)findAncestorWithClass(this, ProducerProvision.class);
			theProducerProvision.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ProducerProvision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ProducerProvision for label tag ");
		}
	}
}

