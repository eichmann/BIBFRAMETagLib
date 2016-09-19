package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicFormDesignationIterator theNotatedMusic = (NotatedMusicFormDesignationIterator)findAncestorWithClass(this, NotatedMusicFormDesignationIterator.class);
			pageContext.getOut().print(theNotatedMusic.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

