package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicProducedAtIterator theNotatedMusicProducedAtIterator = (NotatedMusicProducedAtIterator)findAncestorWithClass(this, NotatedMusicProducedAtIterator.class);
			pageContext.getOut().print(theNotatedMusicProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

