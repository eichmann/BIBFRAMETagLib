package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsUnionOfIterator theMultimediaIsUnionOfIterator = (MultimediaIsUnionOfIterator)findAncestorWithClass(this, MultimediaIsUnionOfIterator.class);
			pageContext.getOut().print(theMultimediaIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

