package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicAccompaniesIterator theNotatedMusicAccompaniesIterator = (NotatedMusicAccompaniesIterator)findAncestorWithClass(this, NotatedMusicAccompaniesIterator.class);
			pageContext.getOut().print(theNotatedMusicAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

