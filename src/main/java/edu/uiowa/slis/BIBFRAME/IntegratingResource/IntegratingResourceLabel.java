package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IntegratingResource theIntegratingResource = (IntegratingResource)findAncestorWithClass(this, IntegratingResource.class);
			if (!theIntegratingResource.commitNeeded) {
				pageContext.getOut().print(theIntegratingResource.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			IntegratingResource theIntegratingResource = (IntegratingResource)findAncestorWithClass(this, IntegratingResource.class);
			return theIntegratingResource.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing IntegratingResource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			IntegratingResource theIntegratingResource = (IntegratingResource)findAncestorWithClass(this, IntegratingResource.class);
			theIntegratingResource.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for label tag ");
		}
	}
}

