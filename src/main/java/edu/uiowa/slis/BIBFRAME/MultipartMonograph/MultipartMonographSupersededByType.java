package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographSupersededByIterator theMultipartMonographSupersededByIterator = (MultipartMonographSupersededByIterator)findAncestorWithClass(this, MultipartMonographSupersededByIterator.class);
			pageContext.getOut().print(theMultipartMonographSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

