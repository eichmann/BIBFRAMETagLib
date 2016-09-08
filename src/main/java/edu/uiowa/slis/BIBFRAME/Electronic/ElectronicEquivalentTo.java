package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicEquivalentTo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicEquivalentTo currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicEquivalentTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicEquivalentToIterator theElectronicEquivalentToIterator = (ElectronicEquivalentToIterator)findAncestorWithClass(this, ElectronicEquivalentToIterator.class);
			pageContext.getOut().print(theElectronicEquivalentToIterator.getEquivalentTo());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for equivalentTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for equivalentTo tag ");
		}
		return SKIP_BODY;
	}
}

