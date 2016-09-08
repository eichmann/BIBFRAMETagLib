package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicPreferredCitation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicPreferredCitation currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicPreferredCitation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicPreferredCitationIterator theElectronic = (ElectronicPreferredCitationIterator)findAncestorWithClass(this, ElectronicPreferredCitationIterator.class);
			pageContext.getOut().print(theElectronic.getPreferredCitation());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for preferredCitation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for preferredCitation tag ");
		}
		return SKIP_BODY;
	}
}

