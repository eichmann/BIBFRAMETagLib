package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasDataSourceIterator theNotatedMusicHasDataSourceIterator = (NotatedMusicHasDataSourceIterator)findAncestorWithClass(this, NotatedMusicHasDataSourceIterator.class);
			pageContext.getOut().print(theNotatedMusicHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

