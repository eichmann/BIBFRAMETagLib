package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicLanguageIterator theElectronicLanguageIterator = (ElectronicLanguageIterator)findAncestorWithClass(this, ElectronicLanguageIterator.class);
			pageContext.getOut().print(theElectronicLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for language tag ");
		}
		return SKIP_BODY;
	}
}

