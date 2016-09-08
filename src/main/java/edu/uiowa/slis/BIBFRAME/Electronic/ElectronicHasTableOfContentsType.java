package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicHasTableOfContentsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicHasTableOfContentsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicHasTableOfContentsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicHasTableOfContentsIterator theElectronicHasTableOfContentsIterator = (ElectronicHasTableOfContentsIterator)findAncestorWithClass(this, ElectronicHasTableOfContentsIterator.class);
			pageContext.getOut().print(theElectronicHasTableOfContentsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for hasTableOfContents tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for hasTableOfContents tag ");
		}
		return SKIP_BODY;
	}
}

