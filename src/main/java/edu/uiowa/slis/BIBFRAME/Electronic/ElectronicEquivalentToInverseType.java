package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicEquivalentToInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicEquivalentToInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicEquivalentToInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicEquivalentToInverseIterator theElectronicEquivalentToInverseIterator = (ElectronicEquivalentToInverseIterator)findAncestorWithClass(this, ElectronicEquivalentToInverseIterator.class);
			pageContext.getOut().print(theElectronicEquivalentToInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for equivalentTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for equivalentTo tag ");
		}
		return SKIP_BODY;
	}
}

