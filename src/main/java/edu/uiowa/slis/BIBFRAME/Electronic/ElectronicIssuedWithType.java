package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicIssuedWithType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicIssuedWithType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicIssuedWithType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicIssuedWithIterator theElectronicIssuedWithIterator = (ElectronicIssuedWithIterator)findAncestorWithClass(this, ElectronicIssuedWithIterator.class);
			pageContext.getOut().print(theElectronicIssuedWithIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for issuedWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for issuedWith tag ");
		}
		return SKIP_BODY;
	}
}

