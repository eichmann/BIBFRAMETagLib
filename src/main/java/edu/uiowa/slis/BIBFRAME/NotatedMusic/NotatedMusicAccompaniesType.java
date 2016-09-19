package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicAccompaniesIterator theNotatedMusicAccompaniesIterator = (NotatedMusicAccompaniesIterator)findAncestorWithClass(this, NotatedMusicAccompaniesIterator.class);
			pageContext.getOut().print(theNotatedMusicAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

