package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographHasPreferredTitleIterator theMultipartMonographHasPreferredTitleIterator = (MultipartMonographHasPreferredTitleIterator)findAncestorWithClass(this, MultipartMonographHasPreferredTitleIterator.class);
			pageContext.getOut().print(theMultipartMonographHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

