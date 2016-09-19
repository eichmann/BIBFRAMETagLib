package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographFollowsIterator theMultipartMonographFollowsIterator = (MultipartMonographFollowsIterator)findAncestorWithClass(this, MultipartMonographFollowsIterator.class);
			pageContext.getOut().print(theMultipartMonographFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for follows tag ");
		}
		return SKIP_BODY;
	}
}

