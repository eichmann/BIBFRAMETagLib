package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasDataSourceInverseIterator theNotatedMusicHasDataSourceInverseIterator = (NotatedMusicHasDataSourceInverseIterator)findAncestorWithClass(this, NotatedMusicHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theNotatedMusicHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

