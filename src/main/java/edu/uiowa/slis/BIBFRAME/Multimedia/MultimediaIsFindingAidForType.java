package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsFindingAidForIterator theMultimediaIsFindingAidForIterator = (MultimediaIsFindingAidForIterator)findAncestorWithClass(this, MultimediaIsFindingAidForIterator.class);
			pageContext.getOut().print(theMultimediaIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

