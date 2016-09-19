package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicIssuedWithInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicIssuedWithInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicIssuedWithInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicIssuedWithInverseIterator theElectronicIssuedWithInverseIterator = (ElectronicIssuedWithInverseIterator)findAncestorWithClass(this, ElectronicIssuedWithInverseIterator.class);
			pageContext.getOut().print(theElectronicIssuedWithInverseIterator.getIssuedWithInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for issuedWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for issuedWith tag ");
		}
		return SKIP_BODY;
	}
}

