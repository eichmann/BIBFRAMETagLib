package edu.uiowa.slis.BIBFRAME.Provision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProvisionAtLocationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProvisionAtLocationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProvisionAtLocationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProvisionAtLocationIterator theProvisionAtLocationIterator = (ProvisionAtLocationIterator)findAncestorWithClass(this, ProvisionAtLocationIterator.class);
			pageContext.getOut().print(theProvisionAtLocationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Provision for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

