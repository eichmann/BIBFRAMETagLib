package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographTranslatedAsIterator theMultipartMonographTranslatedAsIterator = (MultipartMonographTranslatedAsIterator)findAncestorWithClass(this, MultipartMonographTranslatedAsIterator.class);
			pageContext.getOut().print(theMultipartMonographTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

