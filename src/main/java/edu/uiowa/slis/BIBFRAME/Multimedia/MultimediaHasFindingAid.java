package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasFindingAidIterator theMultimediaHasFindingAidIterator = (MultimediaHasFindingAidIterator)findAncestorWithClass(this, MultimediaHasFindingAidIterator.class);
			pageContext.getOut().print(theMultimediaHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}
